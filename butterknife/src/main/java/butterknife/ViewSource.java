package butterknife;

import android.content.Context;
import android.view.View;

/**
 * @author Ornithopter on 2017/1/7.
 */

public interface ViewSource {
    View findViewById(int id);

    boolean isInEditMode();

    Context getContext();
}
