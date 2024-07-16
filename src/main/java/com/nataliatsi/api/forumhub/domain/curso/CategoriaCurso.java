package com.nataliatsi.api.forumhub.domain.curso;

public enum CategoriaCurso {
    MOBILE("mobile"),
    PROGRAMACAO("programação"),
    FRONT_END("front-end"),
    DEVOPS("devops"),
    UX_DESIGN("ux & design"),
    DATA_SCIENCE("data science"),
    INOVACAO_GESTAO("inovação & gestão"),
    INTELIGENCIA_ARTIFICIAL("inteligência artificial");

    private final String descricao;

    CategoriaCurso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
