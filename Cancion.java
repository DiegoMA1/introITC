public class Cancion{
    private String nombre;
    private String artista;
    private String album;
    private int anio;
    private String rating;
    private String runtime;
    Cancion(String nombre, String artista, String album, int anio, String rating, String runtime ){
        this.nombre=nombre;
        this.album=album;
        this.anio=anio;
        this.rating=rating;
        this.runtime=runtime;
    }
    public String getNombre(){
        return nombre;
    }
    public String getArtista(){
        return artista;
    }
    public int getAnio(){
        return anio;
    }
    public String getAlbum(){
        return album;
    }
    public String getRating(){
        return rating;
    }
    public String getRuntime(){
        return rintime;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setArtista(String artista){
        this.artista=artista;
    }
    public void setAlbum(String album){
        this.album=album;
    }
    public void setRating(String rating){
        this.rating=rating;
    }
    public void setRuntime(String runtime){
        this.runtime=runtime;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }
}