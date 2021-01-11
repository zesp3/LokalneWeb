package com.mortarmagnet.LokalneWeb.controller

import com.mortarmagnet.LokalneWeb.Model.Article
import com.mortarmagnet.LokalneWeb.service.InterfaceCRUD
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import javax.validation.Valid


@Controller
class MyController {
    /*
    //old code ???
    @Autowired
    private val articleService: IArticleService? = null

    @GetMapping("/showArticles")
    fun findArticles(model: Model): String {
        model.addAttribute("articles", articleService!!.findAll())
        model.addAttribute("activePage", "articles")
        return "showArticles"
    }
     */
    @Autowired
    private val articleService: InterfaceCRUD? = null

    @GetMapping("/showArticles")
    open fun showArticleList(model: Model): String? {
        if (articleService != null) {
            model.addAttribute("users", articleService.findAllArticles())
        }
        model.addAttribute("activePage", "index")
        return "index"
    }


    //old below \/\/\/
    @GetMapping("/")
    fun indexed(model: Model): String {
        model.addAttribute("activePage", "index")
        return "index"
    }
    //endof

    @GetMapping("/signup")
    fun showSignUpForm(article: Article?): String? {
        return "add-article"
    }


    @PostMapping("/addarticle")
    fun addUser(article: @Valid Article?, result: BindingResult, model: Model?): String? {
        if (result.hasErrors()) {
            return "add-article"
        }
        if (articleService != null) {
            articleService.insert(article)
        }
        return "redirect:/index"
    }

    @PostMapping("/update/{id}")
    fun updateUser(@PathVariable("id") id: Long, article: @Valid Article?, result: BindingResult, model: Model?): String? {
        if (result.hasErrors()) {
            if (article != null) {
                article.setArtId(id)
            }
            return "update-article"
        }
        if (articleService != null) {
            articleService.update(article)
        }
        return "redirect:/index"
    }

    @GetMapping("/delete/{id}")
    fun deleteUser(@PathVariable("id") id: Long, model: Model?): String? {
        if (articleService != null) {
            articleService.delete(id)
        }
        return "redirect:/index"
    }
}