package nl.tudelft.jpacman.level;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.points.PointCalculatorLoader;
import nl.tudelft.jpacman.sprite.PacManSprites;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
public class PelletTest {
//    Create a levelFactory to create a pellet
//        Create a PacmanSprites
        private final PacManSprites sprite_loader = new PacManSprites();
//        Create a GhostFactory
        private GhostFactory ghFactory = new GhostFactory(sprite_loader);
//        Create a pointCalculator
        private PointCalculatorLoader tempCalc = new PointCalculatorLoader();

        private LevelFactory Lvl_factory = new LevelFactory(sprite_loader, ghFactory, tempCalc.load());

        private Pellet testingPellet = Lvl_factory.createPellet();

//        If pellet was created then the value would be set to 10 and nothing else

    @Test
        void testPellet(){
            assertThat(testingPellet.getValue()).isEqualTo(10);
        }
}
