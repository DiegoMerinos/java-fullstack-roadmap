public class SintaxisModerna {

    public static void main(String[] args) {
        System.out.println("=== 1. PRIMITIVOS VS WRAPPERS ===");
        
        // Tipo primitivo (vive en el Stack)
        int edadPrimitiva = 25;
        
        // Wrapper (objeto en el Heap con métodos utilitarios)
        Integer edadWrapper = Integer.valueOf(edadPrimitiva); // Autoboxing
        String textoNumero = "150";
        int numeroParseado = Integer.parseInt(textoNumero); // Convierte String a int

        System.out.println("Primitivo: " + edadPrimitiva);
        System.out.println("Wrapper: " + edadWrapper);
        System.out.println("String a int parseado: " + numeroParseado);

        System.out.println("\n=== 2. TEXT BLOCKS (Java 15+) ===");
        // Bloques de texto multilínea sin concatenar con '+'
        String mensajeBienvenida = """
                Bienvenido a la ruta Java Full Stack.
                Módulo: Mes 01 - Java Core
                Semana: 01 - Sintaxis Moderna
                """;
        System.out.println(mensajeBienvenida);

        System.out.println("=== 3. SWITCH EXPRESSION MODERNO ===");
        int diaSemana = 3; // 1 = Lunes, ..., 7 = Domingo

        String tipoDeJornada = switch (diaSemana) {
            case 1, 2, 3, 4, 5 -> "Jornada laboral activa";
            case 6, 7          -> "Descanso / Fin de semana";
            default            -> "Número de día inválido";
        };

        System.out.println("Día " + diaSemana + " -> " + tipoDeJornada);
    }
}