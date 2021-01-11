package com.mortarmagnet.LokalneWeb.service;

import java.util.List;
import com.mortarmagnet.LokalneWeb.Model.Article;

public interface InterfaceCRUD {
    List<Article> findAllArticles();
    Article findById(long id);
    Article insert(Article a);
    boolean delete(long id);
    boolean update(Article a);
}

