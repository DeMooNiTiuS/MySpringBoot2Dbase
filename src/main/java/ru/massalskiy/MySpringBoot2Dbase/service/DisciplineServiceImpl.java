package ru.massalskiy.MySpringBoot2Dbase.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.massalskiy.MySpringBoot2Dbase.entity.Discipline;
import ru.massalskiy.MySpringBoot2Dbase.dao.DisciplineDAO;
import java.util.List;

@Service
public class DisciplineServiceImpl implements DisciplineService {
    @Autowired
    private DisciplineDAO dao;

    @Override
    @Transactional
    public List<Discipline> getAll() {
        return dao.getAll();
    }

    @Override
    @Transactional
    public Discipline getOne(int id) {
        return dao.getOne(id);
    }

    @Override
    @Transactional
    public Discipline save(Discipline discipline) {
        return dao.save(discipline);
    }

    @Override
    @Transactional
    public void delete(int id) {
        dao.delete(id);
    }
}
