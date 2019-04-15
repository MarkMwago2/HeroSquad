import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "template/layout.vtl";

        get("/",(request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "template/index.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/heroes/new",(request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("template", "template/heroform.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
        get("/heroes",(request,response)->{
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("heroes", Hero.getAll());
            model.put("template", "template/heroList.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
        post("/heroes", (request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            int age = Integer.parseInt(request.queryParams("age"));
            String strength = request.queryParams("strength");
            String weakness = request.queryParams("weak");
            Hero newHero = new Hero(name, age, strength,weakness);
            model.put("template", "template/success.vtl");
            return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());
    }
}