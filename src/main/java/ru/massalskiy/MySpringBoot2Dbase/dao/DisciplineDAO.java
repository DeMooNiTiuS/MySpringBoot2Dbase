package ru.massalskiy.MySpringBoot2Dbase.dao;

import org.springframework.stereotype.Repository;
import ru.massalskiy.MySpringBoot2Dbase.entity.Discipline;
import java.util.List;

@Repository
public interface DisciplineDAO {
    public List<Discipline> getAll();
    public Discipline getOne(int id);
    public Discipline save(Discipline discipline);
    public void delete(int id);
}
