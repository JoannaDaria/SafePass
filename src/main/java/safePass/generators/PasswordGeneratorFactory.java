package safePass.generators;

import static safePass.generators.GeneratorType.UUID;

class PasswordGeneratorFactory {
    PasswordGenerator getGenerator(GeneratorType type) {
        if (type == UUID) {
            return new UuidPasswordGenerator();
        }
        throw new PasswordGeneratorException("No such generator");
    }
}