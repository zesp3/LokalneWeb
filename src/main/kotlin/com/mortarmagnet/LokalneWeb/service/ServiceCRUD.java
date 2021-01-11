package com.mortarmagnet.LokalneWeb.service;

import com.mortarmagnet.LokalneWeb.Model.Article;
import com.mortarmagnet.LokalneWeb.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCRUD implements InterfaceCRUD {
    @Autowired
    private ArticleRepository repository;

    @Override
    public List<Article> findAllArticles() {
        return (List<Article>) repository.findAll();
    }

    @Override
    public Article insert(Article a) {
        return repository.save(a);
    }

    @Override
    public boolean delete(long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean update(Article a) {
        try {
            repository.save(a);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public Article findById(long id) {
        Optional<Article> result = repository.findById(id);
        if (((Optional) result).isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
}
