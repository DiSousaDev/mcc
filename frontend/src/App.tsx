import { Route, Routes } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';

import Home from './components/Home';
import Header from './components/Header';
import { BrowserRouter } from 'react-router-dom';
import RetiroDetails from './components/RetiroDetails';

function App() {
  return (
    <BrowserRouter>
      <Header />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/retiros" element={<RetiroDetails />} />
      </Routes>
    </BrowserRouter>
  )
}

export default App
