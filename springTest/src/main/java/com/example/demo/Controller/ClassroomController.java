package com.example.demo.Controller;


import com.example.demo.po.Classroom;
import com.example.demo.service.ClassroomService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 杨皓
 * @since 2022-10-14
 */
@Api(tags ="Classroom")
@RestController
@RequestMapping("/demo/classroom")
public class ClassroomController {
    public class ClassroomConterller {
        @Autowired
        private ClassroomService classroomService;

        @GetMapping("/all")//http://localhost:8080/article/all
        public List<Classroom> all() {
            return classroomService.list();
        }

        @GetMapping("one")//article/one?id=1
        public Classroom one(Integer id) {
            return classroomService.getById(id);
        }

        @PostMapping("/add")//
        public boolean add(@RequestBody Classroom Classroom) {
            boolean flag = classroomService.save(Classroom);
            return flag;
        }

        @PostMapping("/edit")
        public boolean edit(@RequestBody Classroom Classroom) {
            boolean flag = classroomService.updateById(Classroom);
            return flag;
        }

        @GetMapping("/delete")
        public boolean delete(Integer id) {
            return classroomService.removeById(id);
        }
    }
}
