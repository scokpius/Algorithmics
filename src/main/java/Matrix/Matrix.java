package Matrix;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Matrix {

    public static void main(String[] args) {

        log.info(MatrixService.readFromFile());

        MatrixService.matrixWriter();

        log.info(MatrixService.readFromFile());
    }

}
