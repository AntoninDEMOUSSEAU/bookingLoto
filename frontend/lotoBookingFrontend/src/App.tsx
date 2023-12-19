import './App.css'
import {RouterProvider, createBrowserRouter} from 'react-router-dom';
import {FormulaireSalle} from "./Pages/salles/formulaireSalle";
import {FormulaireUtilisateur} from "./Pages/utilisateur/FormulaireUtilisateur";
import {LayoutPage} from "./components/Layout-page";

const router = createBrowserRouter([
    {
        path: '/',
        element: <LayoutPage/>,
        children: [
            {
                index: true, Component: () => <FormulaireSalle/>
            },
            {
                path: '/salle',
                element: <FormulaireSalle/>
            },
            {
                path: '/user',
                element: <FormulaireUtilisateur/>
            }
        ]
    },

]);

function App() {

  return (
      <>
          <RouterProvider router={router}/>
      </>
  )
}

export default App
