import './App.css'
import {FormulaireSalle} from "./Pages/salles/formulaireSalle";
import {TopBar} from "./components/TopBar";
import {FormulaireUtilisateur} from "./Pages/utilisateur/FormulaireUtilisateur";

function App() {


  return (
    <>
        <TopBar/>
        <h1>Projet #1</h1>
        <FormulaireSalle/>
        <FormulaireUtilisateur/>

    </>
  )
}

export default App
