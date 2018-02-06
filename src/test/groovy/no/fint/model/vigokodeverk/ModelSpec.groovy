package no.fint.model.vigokodeverk

import no.fint.model.test.utils.JsonSnapshots
import spock.lang.Requires
import spock.lang.Specification

class ModelSpec extends Specification {
    private JsonSnapshots jsonSnapshots

    void setup() {
        jsonSnapshots = new JsonSnapshots(this)
    }

    @Requires({ Boolean.valueOf(env['CREATE_SNAPSHOTS']) })
    def "Create snapshots"() {
        expect:
        jsonSnapshots.create()
    }

    def "Matches snapshots"() {
        expect:
        jsonSnapshots.matchesSnapshots()
        jsonSnapshots.matchesRelationNames()
    }
}
