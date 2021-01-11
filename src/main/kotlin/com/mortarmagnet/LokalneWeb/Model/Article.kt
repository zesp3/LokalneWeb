package com.mortarmagnet.LokalneWeb.Model

import javax.persistence.*
import javax.validation.constraints.NotBlank


@Entity
@Table(name = "Articles")
class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null

    //facebook has no titles
    var artname: String? = null

    @NotBlank(message = "Text mandatory")
    var arttext: String? = null

    //Have to secure it, somehow; prolly alt="" tag in <img>
    var artimage: String? = null

    @NotBlank(message = "Source is mandatory")
    var artsource: String? = null

    @NotBlank(message = "Date is mandatory")
    var artdate: String? = null

    constructor() {}
    constructor(id: Long?, artname: String?, arttext: String?, artimage: String?, artsource: String?, artdate: String?) {
        this.id = id
        this.artname = artname
        this.arttext = arttext
        this.artimage = artimage
        this.artsource = artsource
        this.artdate = artdate
    }

    fun getArtId(): Long? {
        return id
    }

    fun setArtId(id: Long?) {
        this.id = id
    }

    fun getImage(): String? {
        return artimage
    }

    fun setImage(artimage: String?) {
        this.artimage = artimage
    }

    fun getArtSource(): String? {
        return artsource
    }

    fun setArtSource(artsource: String?) {
        this.artsource = artsource
    }

    fun getArtDate(): String? {
        return artdate
    }

    fun setArtDate(artdate: String?) {
        this.artdate = artdate
    }

    fun getArtText(): String? {
        return arttext
    }

    fun setArtText(arttext: String?) {
        this.arttext = arttext
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj) {
            return true
        }
        if (obj == null) {
            return false
        }
        if (javaClass != obj.javaClass) {
            return false
        }
        val other = obj as Article
        if (arttext != other.arttext) {
            return false
        }
        if (artname != other.artname) {
            return false
        }
        if (artimage != other.artimage) {
            return false
        }
        return if (artsource != other.artsource) {
            false
        }else id == other.id
    }
    // @Override
    // public String toString() {
    //     final StringBuilder sb = new StringBuilder("City{");
    //     sb.append("id=").append(id);
    //     sb.append(", name='").append(name).append('\'');
    //     sb.append(", population=").append(population);
    //     sb.append('}');
    //     return sb.toString();
    // }
}