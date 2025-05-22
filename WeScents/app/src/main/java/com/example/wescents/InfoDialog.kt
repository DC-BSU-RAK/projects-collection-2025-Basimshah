import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class InfoDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireContext())
            .setTitle("Welcome to WeScents!")
            .setMessage("This app allows you to explore perfumes, save preferences, and find your scent profile.")
            .setPositiveButton("Got it") { _, _ -> }
            .create()
    }
}