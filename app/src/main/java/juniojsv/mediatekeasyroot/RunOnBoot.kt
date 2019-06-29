package juniojsv.mediatekeasyroot

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class RunOnBoot : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context, "Trying to ensure root access", Toast.LENGTH_SHORT).show()
        context?.let { TryRoot(it).execute() }
    }
}