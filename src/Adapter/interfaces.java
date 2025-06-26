package Adapter;

// Interface que espera el cliente
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Interface avanzada con funcionalidades más específicas
interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}

