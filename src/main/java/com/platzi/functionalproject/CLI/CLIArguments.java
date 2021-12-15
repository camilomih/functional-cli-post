package com.platzi.functionalproject.CLI;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    CLIArguments(){

    }

    @Parameter(required = true,
    descriptionKey = "KEYWORD",
    description = "KEYWORD",
    validateWith = KeywordValidator.class)
    private String keyword;

    @Parameter( names = {"--location","-l"}, description = "Cada busqueda puede ser por una descripcion de la publicacion")
    private String text;

    @Parameter( names = {"--limit", "-li"}, description = "La API devuelve retorna una cantidad de resultados, por defecto retornara 10")
    private int limit = 0;

    @Parameter( names = {"--viral-content", "-vc"}, description = "Retorna solo publicaciones con mas de 10 likes ")
    private boolean isViral = false;

    @Parameter(names= {"--animal", "-a"}, description = "Retorna solamente post donde se encuentren animales")
    private boolean isAnimal;

    @Parameter(names = "--help", help = true, description = "Mostrar ayuda", validateWith = HelpValidator.class)
    private boolean isHelp;

    public String getKeyword() {
        return keyword;
    }

    public String getText() {
        return text;
    }

    public int getLimit() {
        return limit;
    }

    public boolean isViral() {
        return isViral;
    }

    public boolean isAnimal() {
        return isAnimal;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", text='" + text + '\'' +
                ", limit=" + limit +
                ", isViral=" + isViral +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
