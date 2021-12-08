package core.basesyntax.services;

import core.basesyntax.model.Activity;
import java.nio.file.Path;
import java.util.List;

public interface FileReaderService {
    List<Activity> readFile(Path path);
}