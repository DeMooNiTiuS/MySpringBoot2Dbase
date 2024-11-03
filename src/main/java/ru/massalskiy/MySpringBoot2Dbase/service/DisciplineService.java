package ru.massalskiy.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Service;
import ru.massalskiy.MySpringBoot2Dbase.entity.Discipline;
import java.util.List;

@Service
public interface DisciplineService {
    List<Discipline> getAll();
    Discipline getOne(int id);
    Discipline save(Discipline discipline);
    void delete(int id);
}
