package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BoardTest {
        // Create a sprite_store
        private static final PacManSprites sprite_store = new PacManSprites();
        // Create a board_factory
        private BoardFactory board_factory = new BoardFactory(sprite_store);
        // Create a Square object of 2d
        private Square newSqr[][]={
            {mock(Square.class)},
            {mock(Square.class)}
        };
        // Create a test board
        private Board test_board = board_factory.createBoard(newSqr);

        // If it was created correctly then the board size would exist 2d with a dimension greater than 0
        @Test
        void create_board_test(){

            assertThat(test_board.getWidth()).isGreaterThan(0);
            assertThat(test_board.getHeight()).isGreaterThan(0);

        }

}
