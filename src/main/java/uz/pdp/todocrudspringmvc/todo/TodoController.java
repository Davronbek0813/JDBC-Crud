package uz.pdp.todocrudspringmvc.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uz.pdp.todocrudspringmvc.dao.Dao;

@Controller
public class TodoController {


    @Autowired
    public Dao dao;



    @RequestMapping(value = "/todos",method = RequestMethod.GET)
    public String getAllTodo(Model model){
       model.addAttribute("listtodo",dao.getAll());
        return "todo";
    }


    @RequestMapping(value = "/addtodo", method = RequestMethod.GET)
    public String addTodo(){
        return "add-task";
    }
    @RequestMapping(value = "/todos", method = RequestMethod.POST)
    public String addTodo(Model model, Todo todo){
        System.out.println(todo);
        dao.save(todo);
        model.addAttribute("listtodo",dao.getAll());
        model.addAttribute("status","Successfuly added");

        return "todo";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(int id,Model model){
        dao.delete(id);
        model.addAttribute("listtodo",dao.getAll());
        model.addAttribute("status","Successfuly deleted");
        return "todo";
    }

    @RequestMapping(value = "/edite",method = RequestMethod.GET)
    public String edite(int id, Model model){
        System.out.println(dao.getFindById(id));
        model.addAttribute("id",id);
        model.addAttribute("updatelist",dao.getFindById(id));
        return "update";
    }

    @RequestMapping(value = "/edite",method = RequestMethod.POST)
    public String edite(Todo todo, Model model){
        dao.update(todo);
        model.addAttribute("listtodo",dao.getAll());
        return "todo";
    }

}
