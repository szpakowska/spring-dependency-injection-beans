package pl.ex.exampleScan;

import com.example.demo.repository.LanguageRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("language")
public class I18nSpanishLanguageService implements LanguageRepository {

    @Override
    public String sayLanguage() {
        return "Spanish";
    }
}
