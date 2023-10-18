package pl.ex.exampleScan;

import com.example.demo.repository.LanguageRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("language")
public class I18nEnglishLanguageService implements LanguageRepository {

    @Override
    public String sayLanguage() {
        return "English";
    }
}
