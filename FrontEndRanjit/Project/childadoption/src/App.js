import { Route, Routes } from 'react-router-dom'
import './App.css';
import { BrowserRouter as Router } from 'react-router-dom';
import Landingpage from './screens/Landingpage';

function App() {
  return(
    <div className='container'>
      
      <Routes>
      <Route path="/" element={<Landingpage />}/>
      </Routes>
     
    </div>
  );
}

export default App;
