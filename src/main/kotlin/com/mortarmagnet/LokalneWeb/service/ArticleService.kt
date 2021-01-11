package com.mortarmagnet.LokalneWeb.service

import com.mortarmagnet.LokalneWeb.Model.Article
import com.mortarmagnet.LokalneWeb.repository.ArticleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ArticleService : IArticleService {
    @Autowired
    private val repository: ArticleRepository? = null
    override fun findAll(): List<Article?>? {
        return repository!!.findAll() as List<Article?>
    }
}