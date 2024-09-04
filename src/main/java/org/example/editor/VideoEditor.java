package org.example.editor;
import  java.util.ArrayList;
import java.util.List;
public class VideoEditor {
    //Descrição: A classe principal que gerencia o processo de edição de vídeo. Ela permite adicionar clipes de vídeo, sobreposições de texto e faixas de áudio.
    //Métodos: Métodos para adicionar clipes, sobreposições de texto e faixas de áudio.
    private List<VideoClip> clips;        // Lista de clipes de vídeo
    private List<TextOverlay> textOverlays; // Lista de sobreposições de texto
    private List<AudioTrack> audioTracks; // Lista de faixas de áudio

    public VideoEditor(){
       // Construtor que inicializa as listas
        clips = new ArrayList<>();
        textOverlays = new ArrayList<>();
        audioTracks = new ArrayList<>();
    }
    public void addClip(VideoClip clip){ //clip porque se refere a um. O arquivo.
        clips.add(clip);
        // Esse metodo adiciona um clip de vídeo à lista utilizando clips.add (a biblioteca do java.util)

    }

    // Adiciona uma sobreposição de texto à lista
    public void addTextOverlay(TextOverlay overlay) {
        textOverlays.add(overlay);
    }

    // Adiciona uma faixa de áudio à lista
    public void addAudioTrack(AudioTrack track) {
        audioTracks.add(track);
    }

}
