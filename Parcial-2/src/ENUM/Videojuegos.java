package ENUM;

import java.io.IOException;

public enum Videojuegos {
    DEPORTIVOS("FIFA 24", "Es jugar futbol virtual", 2023){
        @Override
        public String getmostrarUso() {
            return "DEPORTIVOS " + getNombre() + ", Descripcion: " + getDescripcion() + ", Año creacion: " + getAño();
        }
        @Override
        public String getMostrarRankig() {
            return "#1 en deportes";
        }
        @Override
        public String getComprarMonedas() {
            return "50000$ 200 monedas";
        }
    },
    ESTRATEGIA("Warzone 2.0", "Shooter en primera persona", 2022){
        @Override
        public String getmostrarUso() {
            return "ESTRATEGIA " + getNombre() + ", Descripcion: " + getDescripcion() + ", Año creacion: " + getAño();
        }
        public String getMostrarRankig() {
            return "#1 en Shooters";
        }
        public String getComprarMonedas() {
            return "50000$ 200 monedas";
        }
    },
    MUSICALES("Gitar Hero", "Tocar instrumentos musicales mediante", 2015){
        @Override
        public String getmostrarUso() {
            return "MUSICALES " + getNombre() + ", Descripcion: " + getDescripcion() + ", Año creacion: " + getAño();
        }
        public String getMostrarRankig() {
            return "#3 en Musicales";
        }
        public String getComprarMonedas() {
            return "50000$ 200 monedas";
        }
    },
    AVENTURA("GTA V", "Se basa en la vida de 3 personajes haciendo diferentes misiones en cada 1", 2015){
        @Override
        public String getmostrarUso() {
            return "AVENTURA " + getNombre() + ", Descripcion: " + getDescripcion() + ", Año creacion: " + getAño();
        }
        public String getMostrarRankig() {
            return "#2 en aventaura";
        }
        public String getComprarMonedas() {
            return "50000$ 200 monedas";
        }
    },
    SIMULACION("F1", "Juego de carreras de formula 1 en simulacion, se necesita volante y pedales adaptados para el juego", 2022){
        @Override
        public String getmostrarUso() {
            return "SIMULACION " + getNombre() + ", Descripcion: " + getDescripcion() + ", Año creacion: " + getAño();
        }
        public String getMostrarRankig() {
            return "#1 en simulacion";
        }
        public String getComprarMonedas() {
            return "50000$ 200 monedas";
        }
    };

    private String Nombre;
    private String Descripcion;

    private int Año;

    Videojuegos(String nombre, String descripcion, int año) {
        Nombre = nombre;
        Descripcion = descripcion;
        Año = año;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getAño() {
        return Año;
    }

    public abstract String getmostrarUso();
    public abstract String getMostrarRankig();
    public abstract String getComprarMonedas();

    public void close() throws IOException {
        System.out.println("Close of Enum");
    }

}

class Main {
    public static void main(String[] args) {
        Videojuegos pro = Videojuegos.DEPORTIVOS;
        System.out.println("Juego Deportivo:");
        System.out.println("Nombre: " + pro.getNombre());
        System.out.println("Cómo jugar: " + pro.getDescripcion());
        System.out.println("Año de creación: " + pro.getAño());
        System.out.println("Posición en el ranking: " + pro.getMostrarRankig());
        System.out.println("Comprar monedas: " + pro.getComprarMonedas());
    }
}
