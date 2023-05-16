package job.list.jdbc;

import job.list.jdbc.service.impl.PositionJdbcServise;
import org.junit.jupiter.api.Test;
import job.list.domain.Position;

import java.sql.SQLException;
import java.util.Collection;

class PositionJdbcServiceTest {

    @Test
    void createPosition() {


    }

    @Test
    void deletePositionById() {
    }

    @Test
    void deletePositionByName() {
    }

    @Test
    void findAllPositionWhichNameLike() throws SQLException {
        PositionJdbcServise pJService = new PositionJdbcServise();

        Collection<Position> allLikePositions = pJService.findAllPositionWhichNameLike("%eve%");
        for (Position position : allLikePositions)
            System.out.println(position.getId() + " " + position.getName());

    }

    @Test
    void findPositionById() {
    }

    @Test
    void findAllPositions() {
    }

    @Test
    void findPositionByName() {
    }
}