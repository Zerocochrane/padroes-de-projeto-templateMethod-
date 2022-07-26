import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CafeteriaTest {

    @Test
    public void devePrepararCafe(){
        Cafeteria cafeteria = new Cafeteria();

        assertEquals("Esquentando água Moendo café Colocando no copo Adicionando açúcar e leite", cafeteria.prepararCafe());
    }

    @Test
    public void devePrepararCha(){
        Cafeteria cafeteria = new Cafeteria();
        assertEquals("Esquentando água Preparando o saquinho de chá Colocando no copo Adicionando algumas gotas de limão", cafeteria.prepararCha());
    }
}