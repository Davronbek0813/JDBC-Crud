package uz.pdp.todocrudspringmvc.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Todo {
    private Integer id;
    private String description;
    private LocalDateTime startdate;
    private LocalDateTime enddate;


}
