package com.mortarmagnet.LokalneWeb.repository

import com.mortarmagnet.LokalneWeb.Model.Article
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

//@Repository
//open interface ArticleRepository : CrudRepository<Article?, Long?>

@Repository
public interface ArticleRepository : CrudRepository<Article?, Long?>