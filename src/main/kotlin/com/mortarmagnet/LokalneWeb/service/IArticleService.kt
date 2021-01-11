package com.mortarmagnet.LokalneWeb.service
import com.mortarmagnet.LokalneWeb.Model.Article

interface IArticleService {
    fun findAll(): List<Article?>?
}