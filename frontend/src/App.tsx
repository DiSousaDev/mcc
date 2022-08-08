import './assets/styles/custom.scss';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import { BrowserRouter } from 'react-router-dom';

import Navbar from './components/Navbar';
import Home from './pages/Home';
import RetiroList from './pages/RetiroList';
import RetiroDetail from './pages/RetiroDetail';

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/retiros" element={<RetiroList />} />
        <Route path="/retiros/detalhes" element={<RetiroDetail />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
