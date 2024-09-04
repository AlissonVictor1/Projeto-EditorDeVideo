package org.example.editor;
//Descrição: Representa uma faixa de áudio que pode ser adicionada ao vídeo. Inclui informações sobre o caminho do arquivo e a duração da faixa.
//Métodos: Métodos para acessar e modificar o caminho do arquivo e a duração.
public class AudioTrack {
    private String filePath; // Caminho do arquivo de áudio
    private double duration; // Duração da faixa de áudio (em segundos)

    // Construtor para inicializar a faixa de áudio com o caminho e a duração
    public AudioTrack(String filePath, double duration) {
        this.filePath = filePath;
        this.duration = duration;
    }

    // Métodos getters e setters
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
