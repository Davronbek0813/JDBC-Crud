package uz.pdp.todocrudspringmvc.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uz.pdp.todocrudspringmvc.todo.Todo;

import java.util.List;
@Repository
public class Dao {
    private final JdbcTemplate jdbcTemplate;


    public Dao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Todo> getAll(){
        return jdbcTemplate.query("select * from todo",new BeanPropertyRowMapper<>(Todo.class));

    }

    public Todo getFindById(int id){
        return  jdbcTemplate.query("select * from todo where id=?", new Object[]{id}, new BeanPropertyRowMapper<>(Todo.class)).stream().findAny().orElse(null);


    }

    public void save(Todo todo){
        jdbcTemplate.update("insert into todo(description,startdate,enddate) values (?,?,?)",
        todo.getDescription(),
        todo.getStartdate(),
        todo.getEnddate());

    }

    public void update(Todo todo){
        jdbcTemplate.update("update todo set description=?,startdate=?,enddate=? where id=?",
                todo.getDescription(),
                todo.getStartdate(),
                todo.getEnddate(),
                todo.getId());



    }

    public void delete(int id){
        jdbcTemplate.update("delete from todo where id="+id);

    }
}
