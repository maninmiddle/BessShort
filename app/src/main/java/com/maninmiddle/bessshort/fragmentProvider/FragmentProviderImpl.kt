package com.maninmiddle.bessshort.fragmentProvider

import androidx.fragment.app.Fragment
import com.maninmiddle.bessshort.presentation.fragments.stub.StubFragment
import com.maninmiddle.core.util.FragmentProvider

class AppFragmentProvider : FragmentProvider {
    override fun getStubFragment(): Fragment {
        return StubFragment()
    }
}