package com.autoflex.tms;

import com.autoflex.tms.entities.*;
import com.autoflex.tms.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class TmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsApplication.class, args);
    }

    @Bean()
    CommandLineRunner init(BugService bugService , ProjectService projectService, TaskService taskService) {
        return args -> {

//
//            Bug firstB = new Bug("smell code", true, true, "pzdc", "777");
//            Bug secondB = new Bug("smell code2", false, true, "pzdc2", "777");
//            Bug secondBB = new Bug("smell code2", true, true, "pzdc2", "777");
//            Bug thirdB = new Bug("smell code3", true, false, "pzdc3", "779");
//
//            bugRepository.save(firstB);
//            bugRepository.save(secondB);
//            bugRepository.save(secondBB);
//            bugRepository.save(thirdB);
//            Project project = new Project("TMS", manager, true, "project description", LocalDate.of(2022, 11, 11));
//            Project project = new Project("TMS", true, "project description", LocalDate.of(2022, 11, 11));
//            Manager manager = new Manager(new User("Manager Borys", "borys@gmail.com", "123456", Role.MANAGER));
////            managerService.createManager(manager); fixme: doesn't create
//
//            managerRepository.save(manager);
//            Employee employee = new Employee(project, manager, new User("Spunch Bob", "bob@gmail.com", "123456", Role.EMPLOYEE));
//            Employee employee2 = new Employee(project, manager, new User("Ann", "ann@gmail.com", "123456", Role.EMPLOYEE));
//            employeeRepository.save(employee);
//            employeeRepository.save(employee2);
            Task task = new Task("first task", "description", LocalDate.of(2022, 9, 3),
                    false, true, Status.NEW, LocalDateTime.now().withNano(0), LocalDateTime.now().withNano(0));
            Task task2 = new Task("second task", "description 2", LocalDate.of(2022, 7, 31),
                    true, true, Status.NEW, LocalDateTime.now().withNano(0), LocalDateTime.now().withNano(0));
            Task task3 = new Task("third task", "description 3", LocalDate.of(2022, 7, 31),
                    true, true, Status.NEW, LocalDateTime.now().withNano(0), LocalDateTime.now().withNano(0));


//            taskService.createTask(Mapper.convertToGetAllTaskDto(task));
//            taskService.createTask(Mapper.convertToGetAllTaskDto(task2));
//            taskService.createTask(Mapper.convertToGetAllTaskDto(task3));
//
//            List<Task> list  = taskRepository.findByEmployeeEmail("ann@gmail.com");
////            List<Task> list  = taskRepository.findAll();
//            for (Task t : list){
//                System.out.println(t);
//            }

        };
    }

}