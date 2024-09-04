package org.example.editor;
//Descrição: Representa uma sobreposição de texto a ser adicionada ao vídeo. Inclui informações sobre o texto, a posição e o tamanho da fonte.
//Métodos: Métodos para acessar e modificar o texto, a posição e o tamanho da fonte.
public class TextOverlay {
    private String text;         // Texto a ser sobreposto no vídeo
    private int x;       // Posição X do texto
    private int y;       // Posição Y do texto
    private int fontSize;        // Tamanho da fonte do texto

    // Construtor para inicializar a sobreposição de texto
    // Este construtor ja vai ter solicitar parametros de todos os Dados do Texto.
    public TextOverlay(String text, int x, int y, int fontSize) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.fontSize = fontSize;
    }

    // Métodos getters e setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getX() {
        return x;
    }

    public void setX(int xPosition) {
        this.x = xPosition;
    }

    public int getY() {
        return y;
    }

    public void setY(int yPosition) {
        this.y = yPosition;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
