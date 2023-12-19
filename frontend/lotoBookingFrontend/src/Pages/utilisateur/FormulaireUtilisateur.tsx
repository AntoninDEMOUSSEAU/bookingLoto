import {useState} from "react";
import {input} from '../../style/style.js';

export const FormulaireUtilisateur = () => {

    const [newUser, setNewUser] = useState({
        prenom:'',
        nom:'',
        email:'',
        telephone:''
    });

    const handleChange = ({currentTarget}) =>{
      const {name, value} = currentTarget;
      setNewUser({...newUser,[name]:value})
    };

    const handleSubmit = async (event) => {
        event.preventDefault();
        console.log(newUser);
        //fetch
      }

    return (
        <>
            <form>
                <label>Prénom</label>
                <input className={input.default} name ='prenom'onChange={handleChange}/>
                <label>Nom</label>
                <input className={input.default} name ='nom' onChange={handleChange}/>
                <label>Email</label>
                <input className={input.default} name='email' onChange={handleChange}/>
                <label>Telephone</label>
                <input className={input.default} name='telephone' onChange={handleChange}/>
                <button onClick={handleSubmit}> Enregistrer</button>
            </form>
        </>
    );
};
