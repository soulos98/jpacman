package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    private static PacManSprites temp_store = new PacManSprites();
    private PlayerFactory Factory = new PlayerFactory(temp_store);
    private Player n_player = Factory.createPacMan();

    @Test
    void testAlive(){
        assertThat(n_player.isAlive()).isEqualTo(true);
    }


}
