package Monedas;

public record Divisa(String result,
                     int convertion_rate,
                     String documentation,
                     String base_code,
                     String tarjet_code,
                     String release_date){
    public String conversion() {
        return null;
    }
}
