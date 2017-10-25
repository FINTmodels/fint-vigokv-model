# fint-vigokv-model


## Snapshot tester

Testene er tilgjengelig i `ModelSpec`. De genererte json-filene vil lagres i `src/test/resources/snapshots`, disse skal sjekkes inn i git.

1. Kjør testen `Matches snapshots` for å verifisere at modellene fungerer med snapshot filene.
2. Kjør `Create snapshots` for å regenerere snapshot json-filene. Denne testen må kjøres med system property `CREATE_SNAPSHOTS=true`.