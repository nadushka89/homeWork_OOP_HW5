package ui;
import presenter.Presenter;

import java.io.IOException;

public interface View {
    void setPresenter(Presenter presenter);
    void start() throws Exception;
}
