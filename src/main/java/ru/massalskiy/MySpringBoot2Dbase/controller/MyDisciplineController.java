package ru.massalskiy.MySpringBoot2Dbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.massalskiy.MySpringBoot2Dbase.entity.ActionResult;
import ru.massalskiy.MySpringBoot2Dbase.entity.Discipline;
import ru.massalskiy.MySpringBoot2Dbase.service.DisciplineService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MyDisciplineController {
    @Autowired
    private DisciplineService disciplineService;

    @GetMapping("/disciplines")
    public List<Discipline> allDisciplines() {
        return disciplineService.getAll();
    }

    @GetMapping("/disciplines/{id}")
    public ActionResult<Discipline> getDiscipline(@PathVariable("id") int id) {
        Discipline res;
        try {
            res = disciplineService.getOne(id);
        } catch (Exception e) {
            res = null;
        }
        return new ActionResult<>(res, res != null);
    }

    @PostMapping("/disciplines")
    public ActionResult<Discipline> saveDiscipline(@RequestBody Discipline Discipline) {
        Discipline res;
        try {
            res = disciplineService.save(Discipline);
        } catch (Exception e) {
            res = null;
        }
        return new ActionResult<>(res, res != null);
    }

    @PutMapping("/disciplines")
    public ActionResult<Discipline> updateDiscipline(@RequestBody Discipline Discipline) {
        Discipline res;
        try {
            res = disciplineService.save(Discipline);
        } catch (Exception e) {
            res = null;
        }
        return new ActionResult<>(res, res != null);
    }

    @DeleteMapping("/disciplines/{id}")
    public void deleteDiscipline(@PathVariable("id") int id) {
        disciplineService.delete(id);
    }
}
