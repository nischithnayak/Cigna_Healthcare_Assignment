enum SDLCPhase {
    REQUIREMENTS, DESIGN, DEVELOPMENT, TESTING, DEPLOYMENT, MAINTENANCE
}

public class SDLCFlow {
    public static void main(String[] args) {
        for (SDLCPhase phase : SDLCPhase.values()) {
            System.out.println("SDLC Phase: " + phase);
        }
    }
}

