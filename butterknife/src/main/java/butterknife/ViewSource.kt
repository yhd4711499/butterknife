package butterknife

import android.content.Context
import android.view.View

/**
 * @author Ornithopter on 2017/1/7.
 */

interface ViewSource {
    fun <T : View> findView(id: Int): T?

    fun getContext(): Context?

    val isInEditMode: Boolean
}
