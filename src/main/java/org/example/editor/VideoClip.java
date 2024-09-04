package org.example.editor;

public class VideoClip {
    //Descrição: Representa um clipe de vídeo. Inclui informações sobre o caminho do arquivo e o intervalo de tempo que o clipe deve cobrir.
    //Métodos: Métodos para acessar e modificar o caminho do arquivo e os tempos de início e fim.
    private String filePath; // Caminho do arquivo do clipe de vídeo;
    private double startTime; // Representa o tempo de inicio do clipe (em segundos)
    private double endTime; // Representa o tempo do fim do clipe (em segundos)
// Construtor para inicializar o clipe, o caminho e os tempos.
    public VideoClip(String filePath, double startTime, double endTime ){
        this.filePath = filePath;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    //Métodos Getters and Setters. Para acessar os acessos privados
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

}
