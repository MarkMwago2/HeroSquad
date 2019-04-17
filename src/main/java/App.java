import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "template/layout.vtl";
        staticFileLocation("/public");

        ProcessBuilder process = new ProcessBuilder();
        Integer port;
        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;

            get("/", (request, response) -> {
                Map<String, Object> model = new HashMap<String, Object>();
                ArrayList<Hero> Hero=request.session().attribute("heroes");
                model.put("heroes", Hero);
                model.put("template", "template/newhwero.vtl");
                return new ModelAndView(model, layout);
            },  new VelocityTemplateEngine());

            post("/heroes",(request,response)->{
                Map <String,Object> model = new HashMap<String,Object>();
                ArrayList<Hero> heroes=request.session().attribute("heroes");
                String name =request.queryParams("name");
                int age = Integer.parseInt(request.queryParams("age"));
                String specialPowers =request.queryParams("specialPowers");
                String weakness =request.queryParams("weakness");
                Hero newHero = new Hero(name,age,specialPowers,weakness);
                model.put("template","template/success.vtl");
                return new ModelAndView(model,layout);
            },new VelocityTemplateEngine());

            get("/heroes",(request,response)->{
                Map <String,Object> model = new HashMap<String,Object>();
                model.put("heroes",Hero.getAll());
                model.put("template","template/heroes.vtl");
                return new ModelAndView(model,layout);
            },new VelocityTemplateEngine());

            get("/hero/:id",(request,response)->{
                Map<String,Object>	model = new HashMap<>();
                String id = request.session().attribute(":id");
                 Hero hero = Hero.find(Integer.parseInt(id));

               // model.put("heroes",request.session().attributes());
                model.put("hero",hero);
                model.put("template","template/hero.vtl");
                return new ModelAndView(model,layout);
            },new VelocityTemplateEngine());

            get("/addsquad",(request,response)->{
                Map <String,Object> model = new HashMap<String,Object>();
                model.put("heroes",Hero.getAll());
                model.put("template","templates/addsquad.vtl");
                return new ModelAndView(model,layout);
            },new VelocityTemplateEngine());

        }
    }
}


