package Adapter;

// Reproductor VLC
class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Reproduciendo VLC: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // No hace nada
    }
}

// Reproductor MP4
class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // No hace nada
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Reproduciendo MP4: " + fileName);
    }
}

